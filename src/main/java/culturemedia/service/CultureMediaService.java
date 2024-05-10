package main.java.culturemedia.service;
import culturemedia.model.*;
import main.java.culturemedia.model.Video;

import java.util.List;
public interface CultureMediaService {

    List<Video> findAllVideos();
    Video add(Video video);
    View add(View view);

}