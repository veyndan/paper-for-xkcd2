package com.veyndan.paperforxkcd

import kotlinx.coroutines.experimental.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface XkcdService {

    @GET("info.0.json")
    fun latest(): Deferred<Response<XkcdComic>>
}