package com.stew.kb_user.repo

import androidx.lifecycle.MutableLiveData
import com.stew.kb_common.base.BaseRepository
import com.stew.kb_user.api.UserApi
import com.stew.kb_user.bean.LoginBean

/**
 * Created by stew on 8/21/22.
 * mail: stewforani@gmail.com
 */
class LoginRepo(private val api: UserApi) : BaseRepository() {
    suspend fun login(username: String, password: String, data: MutableLiveData<LoginBean>) =
        dealResp(
            block = { api.login(username, password) }, data
        )

}