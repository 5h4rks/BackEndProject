package culturemedia.service;
import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.*;

import java.util.List;
public interface CultureMediaServices {

    List<Video> findAllVideos() throws VideoNotFoundException;
    Video add(Video video);
    View add(View view);

}