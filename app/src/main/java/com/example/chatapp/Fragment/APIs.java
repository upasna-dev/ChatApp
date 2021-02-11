package com.example.chatapp.Fragment;

import com.example.chatapp.Notifications.MyResponse;
import com.example.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIs {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAYPz-hhc:APA91bHX6GWA1gWYujHHKs1DMCcb_gl2OSPA-g4EWdactAs3L1zDqh2i_O7NFJwXmBWOHMrEQS0uSX4BH2abCAkoTvngU_trRL3MDCphYxFkNDmWp7Ksl_BSf-W-JJgpZnONxJPUM50D"
            }
       )

    @POST("fcm/send")
    Call<MyResponse> sendNotifications(@Body Sender body);
}
