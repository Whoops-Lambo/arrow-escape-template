package com.adsurge.adn.p004a;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public interface a {
    void onActivityResult(int i, int i2, Intent intent);

    void onAfterCreate(Bundle bundle);

    void onBackPressed();

    void onBeforeCreate(Activity activity, Bundle bundle);

    void onConfigurationChanged(Configuration configuration);

    void onDestroy();

    void onPause();

    void onResume();

    void onStop();
}
