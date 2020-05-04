package id.sasmita.pert12internet.api

import id.sasmita.pert12internet.model.Photo
import io.reactivex.Single
import retrofit2.http.GET

interface PhotosApi {
    @GET("photos")
    fun getPhotos(): Single<List<Photo>>

}