package cs425.mediaStream.BadWords.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name ="dirtywords" )
public class DirtyWord {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String Word;

	public DirtyWord(Integer id, String word) {
		this.id = id;
		Word = word;
	}
	public DirtyWord() {
	}

	public String getWord() {
		return Word;
	}

	public void setWord(String word) {
		Word = word;
	}
}
