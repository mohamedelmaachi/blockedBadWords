package cs425.mediaStream.BadWords.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotNull;
import java.util.List;

@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
public class ContentCheckResponse {

    @NotNull(message = "content is required")
    private List<String> blocked;
    private Boolean isClean ;

    public ContentCheckResponse() {}
    public ContentCheckResponse(List<String> blocked) {
        this.blocked = blocked;
        this.isClean = blocked.isEmpty();
    }

    public List<String> getBlocked() {
        return blocked;
    }

    public void setBlocked(List<String> blocked) {
        this.blocked = blocked;
    }

    public Boolean getClean() {
        return isClean;
    }

    public void setClean(Boolean clean) {
        isClean = clean;
    }
}
