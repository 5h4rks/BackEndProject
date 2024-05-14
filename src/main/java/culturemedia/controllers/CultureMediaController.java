package culturemedia.controllers;

import java.util.List;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.service.CultureMediaServices;

public class CultureMediaController {

	private final CultureMediaServices cultureMediaService;

	public CultureMediaController(CultureMediaServices cultureMediaService) {
		this.cultureMediaService = cultureMediaService;
	}

	public List<Video> findAllVideos() throws VideoNotFoundException {
		List<Video> videos = cultureMediaService.findAllVideos();
		return videos;
	}
}