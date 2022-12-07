package uz.juo.e_messanger.db.preference

import android.content.Context
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKeys

class PreferencesManager(
    private val context: Context
) {

    var masterKeyAlias = MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC)

    var sharedPreferences = EncryptedSharedPreferences.create(
        "e_rent_secret_shared_prefs",
        masterKeyAlias,
        context,
        EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
        EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
    )

    // use the shared preferences and editor as you normally would
    var editor = sharedPreferences.edit()


    var headertoken by PreferencesDelegate(sharedPreferences as EncryptedSharedPreferences, HEADER_TOKEN, "")


    companion object {

        private const val HEADER_TOKEN = "header_token"

    }

}