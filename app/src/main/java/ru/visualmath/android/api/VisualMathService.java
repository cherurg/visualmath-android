package ru.visualmath.android.api;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import ru.visualmath.android.api.model.Lecture;
import ru.visualmath.android.api.model.NewUser;
import ru.visualmath.android.api.model.QuestionBlock;
import ru.visualmath.android.api.model.SyncLecture;
import ru.visualmath.android.api.model.User;

public interface VisualMathService {
    @POST("login")
    Observable<User> login(@Body Map<String, String> data);

    @POST("users/create")
    Observable<User> createUser(@Body NewUser newUser);

    @GET("lectures/list")
    Observable<List<Lecture>> lecturesList();

    @POST("questionBlock/load")
    Observable<QuestionBlock> loadQuestionBlock(@Body Map<String, String> data);

    @GET("sync_v1/lectures/list")
    Observable<List<SyncLecture>> syncLectureList();

    @POST("sync_v1/ongoing_lectures/load_lecture")
    void loadSyncLecture();

    @POST("sync_v1/ongoing_lectures/load_slide")
    void loadSyncSlide();

    @POST("sync_v1/ongoing_lectures/metainfo")
    void metaInfo();

    @POST("sync_v1/ongoing_lectures/userinfo")
    void userInfo();
}