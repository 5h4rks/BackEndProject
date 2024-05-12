import culturemedia.exeption.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.model.View;
import culturemedia.repository.VideoRepository;
import culturemedia.repository.ViewRepository;
import culturemedia.repository.impl.VideoRepositoryImpl;
import culturemedia.repository.impl.ViewRepositoryImpl;
import culturemedia.service.CultureMediaService;
import culturemedia.service.impl.CultureMediaServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CultureMediaServiceImplTest {
    CultureMediaService cultureMediaService;
    VideoRepository videoRepository;
    ViewRepository viewsRepository;
    Video video ;
    View view;

    @BeforeEach
    void setUp() {
        video = new Video("123", "title", "description", 2.0);
        view = new View("Jhon Doe", LocalDate.now().atStartOfDay(), 23, video);
        viewsRepository = new ViewRepositoryImpl();
        videoRepository = new VideoRepositoryImpl();
        cultureMediaService = new CultureMediaServiceImpl(videoRepository, viewsRepository);
    }

    @Test
    void fid_all_exception() {
        assertThrows(VideoNotFoundException.class, () -> {
            cultureMediaService.findAllVideos();
        });
    }

    @Test
    void find_all() throws VideoNotFoundException {
        List<Video> expected = new ArrayList<>();
        expected.add(video);
        cultureMediaService.add(video);
        List<Video> videos = cultureMediaService.findAllVideos();
        assertEquals(expected, videos);
    }
}