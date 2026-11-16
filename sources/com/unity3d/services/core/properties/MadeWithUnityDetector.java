package com.unity3d.services.core.properties;

import android.app.Activity;
import com.unity3d.player.UnityPlayer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class MadeWithUnityDetector {
    public static final String UNITY_PLAYER_CLASS_NAME = "com.unity3d.player.UnityPlayer";

    public static boolean isMadeWithUnity() {
        try {
            Activity activity = UnityPlayer.currentActivity;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
