package com.example.permissionsex

import android.content.Context

class SharedPreferencesHelper(context: Context) {

    companion object{
        const val permission_preferences = "PERMISSION_PREFS"
    }

    private val preferences = context.getSharedPreferences(permission_preferences, Context.MODE_PRIVATE)

    fun savePermission(permission: String, granted: Boolean){
        preferences.edit().putBoolean(permission, granted).apply()
    }

    fun getPermissionState(permission: String) = preferences.getBoolean(permission, false)
}