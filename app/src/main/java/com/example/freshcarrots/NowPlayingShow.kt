package com.example.freshcarrots

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single book from the NY Times API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class NowPlayingShow
{



    @SerializedName("poster_path")
    var poster: String? = null


    @SerializedName("original_name")
    var title: String? = null


    @SerializedName("overview")
    var overview: String? = null


}