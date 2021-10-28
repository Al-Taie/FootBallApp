package com.watermelon.footballapp.utils

import okhttp3.Interceptor
import okhttp3.Response

class FootballInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
            .newBuilder()
            .addHeader("X-Auth-Token", "bc0c8efbba764b32af2897fdd00527bf")
            .build()
        return chain.proceed(request)
    }
}