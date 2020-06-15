package cs425.mediaStream.BadWords.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import cs425.mediaStream.BadWords.domain.DirtyWord;
import cs425.mediaStream.BadWords.service.dto.ContentCheckResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import cs425.mediaStream.BadWords.repository.DirtyWordRepository;

import cs425.mediaStream.BadWords.util.JwtTokenUtil;
@Service
@Transactional // ?
public class BadWordsService {


	@Autowired
	DirtyWordRepository dirtyWordRepository;
	public BadWordsService(){}

	public ContentCheckResponse checkContent(String content) {
		List<DirtyWord> dirtyWords = dirtyWordRepository.findAll();
		dirtyWords = dirtyWords.stream().filter(word ->
				{
				//	System.out.println(word.getWord().toLowerCase()+" -> "+ content.toLowerCase().contains(word.getWord().toLowerCase()));
					return content.toLowerCase().contains(word.getWord().toLowerCase());
				}
		).collect(Collectors.toList());;
		List<String> listDrityWords = new ArrayList<String>();
		dirtyWords.forEach(word->listDrityWords.add(word.getWord()));
		return new ContentCheckResponse(listDrityWords);
	}
}