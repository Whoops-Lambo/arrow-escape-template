package com.unity3d.player;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.Collections;
import java.util.Map;
import java.util.Vector;

/* JADX INFO: renamed from: com.unity3d.player.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C5252g implements OnCompleteListener {
    public final IAssetPackManagerDownloadStatusCallback a;
    public final UnityPlayer b;
    public final String[] c;

    public C5252g(UnityPlayer unityPlayer, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, String[] strArr) {
        this.b = unityPlayer;
        this.a = iAssetPackManagerDownloadStatusCallback;
        this.c = strArr;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        long j;
        try {
            AssetPackStates assetPackStates = (AssetPackStates) task.getResult();
            Map mapPackStates = assetPackStates.packStates();
            if (mapPackStates.size() != 0) {
                Vector vector = new Vector();
                for (AssetPackState assetPackState : mapPackStates.values()) {
                    if (assetPackState.errorCode() == 0 && assetPackState.status() != 4 && assetPackState.status() != 5 && assetPackState.status() != 0) {
                        vector.add(assetPackState.name());
                    } else {
                        String strName = assetPackState.name();
                        int iStatus = assetPackState.status();
                        int iErrorCode = assetPackState.errorCode();
                        long j2 = assetPackStates.totalBytes();
                        if (iStatus == 4) {
                            j = j2;
                        } else {
                            j = 0;
                        }
                        this.b.invokeOnMainThread(new RunnableC5244c(Collections.singleton(this.a), strName, iStatus, j2, j, 0, iErrorCode));
                    }
                }
                if (vector.size() > 0) {
                    C5258j c5258j = C5258j.e;
                    UnityPlayer unityPlayer = this.b;
                    IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback = this.a;
                    c5258j.getClass();
                    synchronized (C5258j.e) {
                        try {
                            C5246d c5246d = c5258j.d;
                            if (c5246d == null) {
                                C5246d c5246d2 = new C5246d(c5258j, unityPlayer, iAssetPackManagerDownloadStatusCallback);
                                c5258j.b.registerListener(c5246d2);
                                c5258j.d = c5246d2;
                            } else {
                                c5246d.a(iAssetPackManagerDownloadStatusCallback);
                            }
                            c5258j.c.addAll(vector);
                            c5258j.b.fetch(vector);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        } catch (RuntimeExecutionException e) {
            Throwable cause = e;
            String[] strArr = this.c;
            if (strArr.length == 1) {
                String str = strArr[0];
                do {
                    cause = cause.getCause();
                } while (cause != null);
                this.b.invokeOnMainThread(new RunnableC5244c(Collections.singleton(this.a), str, 0, 0L, 0L, 0, -100));
                return;
            }
            C5258j c5258j2 = C5258j.e;
            IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback2 = this.a;
            c5258j2.getClass();
            for (String str2 : strArr) {
                c5258j2.b.getPackStates(Collections.singletonList(str2)).addOnCompleteListener(new C5252g(c5258j2.a, iAssetPackManagerDownloadStatusCallback2, new String[]{str2}));
            }
        }
    }
}
