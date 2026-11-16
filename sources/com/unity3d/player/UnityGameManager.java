package com.unity3d.player;

import android.app.GameManager;
import android.content.Context;
import defpackage.dk1;
import defpackage.uj2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class UnityGameManager {
    private static Object mGameManager;

    public static Object getGameManager(Context context) {
        if (!PlatformSupport.SNOW_CONE_SUPPORT) {
            uj2.a(6, "getGameManager: API level not supported. API level 31 is required.");
            return null;
        }
        Object obj = mGameManager;
        if (obj != null) {
            return obj;
        }
        if (context == null) {
            uj2.a(6, "UnityGame: Request for GameManager supplied with null context.");
            return null;
        }
        Object systemService = context.getSystemService((Class<Object>) dk1.l());
        mGameManager = systemService;
        return systemService;
    }

    public static int getGameMode(Context context) {
        if (!PlatformSupport.SNOW_CONE_SUPPORT) {
            uj2.a(6, "getGameMode: API level not supported. API level 31 is required.");
            return 0;
        }
        GameManager gameManagerC = dk1.c(getGameManager(context));
        if (gameManagerC != null) {
            return gameManagerC.getGameMode();
        }
        uj2.a(6, "UnityGame: GameManager not available.");
        return 0;
    }
}
