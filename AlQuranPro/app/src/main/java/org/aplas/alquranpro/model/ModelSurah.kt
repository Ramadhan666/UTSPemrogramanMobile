package org.aplas.alquranpro.model

import java.io.Serializable

/**
 * Created by Ramadhan on 17-10-2020.
 */

class ModelSurah : Serializable {

    var arti: String? = null

    @JvmField
    var asma: String? = null

    @JvmField
    var ayat: String? = null

    @JvmField
    var nama: String? = null

    @JvmField
    var type: String? = null
    var audio: String? = null

    @JvmField
    var nomor: String? = null
    var keterangan: String? = null

}