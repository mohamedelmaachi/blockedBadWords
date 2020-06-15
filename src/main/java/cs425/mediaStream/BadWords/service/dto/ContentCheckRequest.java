package cs425.mediaStream.BadWords.service.dto;

import javax.validation.constraints.NotNull;


public class ContentCheckRequest {

	@NotNull(message = "content is required")
	private String content;

	public ContentCheckRequest() {
	}

	public ContentCheckRequest(@NotNull(message = "content is required") String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}
}
