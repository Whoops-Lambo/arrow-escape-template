package com.unity3d.player;

import android.app.GameManager;
import android.content.Context;
import defpackage.dk1;
import defpackage.n62;
import defpackage.uj2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class UnityGameState {
    private static String ModeName(int i) {
        if (i == 0) {
            return "UNKNOWN";
        }
        if (i == 1) {
            return "NONE";
        }
        if (i == 2) {
            return "GAMEPLAY_INTERRUPTIBLE";
        }
        if (i != 3) {
            return i != 4 ? String.valueOf(i) : "CONTENT";
        }
        return "GAMEPLAY_UNINTERRUPTIBLE";
    }

    public static void setGameState(Context context, boolean z, int i, int i2, int i3) {
        if (!PlatformSupport.TIRAMISU_SUPPORT) {
            uj2.a(6, "setGameState: API level not supported. API level 33 is required.");
            return;
        }
        GameManager gameManagerC = dk1.c(UnityGameManager.getGameManager(context));
        if (gameManagerC == null) {
            uj2.a(6, "UnityGame: GameManager not available.");
            return;
        }
        uj2.a(4, "SetGameState: isLoading: " + z + ", mode: " + ModeName(i) + ", label: " + i2 + ", quality: " + i3);
        gameManagerC.setGameState(n62.c(i, i2, i3, z));
    }

    public static void setGameState(Context context, boolean z, int i) {
        if (!PlatformSupport.TIRAMISU_SUPPORT) {
            uj2.a(6, "setGameState: API level not supported. API level 33 is required.");
            return;
        }
        GameManager gameManagerC = dk1.c(UnityGameManager.getGameManager(context));
        if (gameManagerC == null) {
            uj2.a(6, "UnityGame: GameManager not available.");
            return;
        }
        uj2.a(4, "SetGameState: " + z + " " + i);
        gameManagerC.setGameState(n62.d(i, z));
    }
}
