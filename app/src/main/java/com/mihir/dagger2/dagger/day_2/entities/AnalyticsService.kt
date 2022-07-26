package com.mihir.dagger2.day_2.component

import android.util.Log
import javax.inject.Inject

interface AnalyticsService {
    fun trackEvent(eventName : String,eventType : String)
}
class Mixpanel @Inject constructor() : AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("MyTag", "trackEvent: Mixpanel")
    }

}

class FirebaseAnalytics : AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("MyTag", "trackEvent: FirebaseAnalytics")
    }

}

