package com.unity3d.player;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.Map;

/* JADX INFO: renamed from: com.unity3d.player.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C5256i implements OnCompleteListener {
    public final IAssetPackManagerStatusQueryCallback a;
    public final UnityPlayer b;
    public final String[] c;

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        if (this.a == null) {
            return;
        }
        int i = 0;
        try {
            AssetPackStates assetPackStates = (AssetPackStates) task.getResult();
            Map mapPackStates = assetPackStates.packStates();
            int size = mapPackStates.size();
            String[] strArr = new String[size];
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            for (AssetPackState assetPackState : mapPackStates.values()) {
                strArr[i] = assetPackState.name();
                iArr[i] = assetPackState.status();
                iArr2[i] = assetPackState.errorCode();
                i++;
            }
            this.b.invokeOnMainThread(new RunnableC5254h(this.a, assetPackStates.totalBytes(), strArr, iArr, iArr2));
        } catch (RuntimeExecutionException e) {
            e = e;
            String message = e.getMessage();
            for (String str : this.c) {
                if (message.contains(str)) {
                    UnityPlayer unityPlayer = this.b;
                    IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback = this.a;
                    String[] strArr2 = {str};
                    int[] iArr3 = {0};
                    do {
                        e = e.getCause();
                    } while (e != null);
                    unityPlayer.invokeOnMainThread(new RunnableC5254h(iAssetPackManagerStatusQueryCallback, 0L, strArr2, iArr3, new int[]{-100}));
                    return;
                }
            }
            String[] strArr3 = this.c;
            int[] iArr4 = new int[strArr3.length];
            int[] iArr5 = new int[strArr3.length];
            int i2 = 0;
            while (true) {
                String[] strArr4 = this.c;
                if (i2 >= strArr4.length) {
                    this.b.invokeOnMainThread(new RunnableC5254h(this.a, 0L, strArr4, iArr4, iArr5));
                    return;
                }
                iArr4[i2] = 0;
                Throwable cause = e;
                do {
                    cause = cause.getCause();
                } while (cause != null);
                iArr5[i2] = -100;
                i2++;
            }
        }
    }

    public C5256i(UnityPlayer unityPlayer, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback, String[] strArr) {
        this.b = unityPlayer;
        this.a = iAssetPackManagerStatusQueryCallback;
        this.c = strArr;
    }
}
