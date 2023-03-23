package com.example.freshcarrots

import android.support.annotation.Keep
import com.google.gson.annotations.SerializedName

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The Model for storing a single book from the NY Times API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */

@Keep
@Serializable
class NowTrendingActor
{



    @SerializedName("profile_path")
    var profile: String? = null


    @SerializedName("name")
    var name: String? = null


}