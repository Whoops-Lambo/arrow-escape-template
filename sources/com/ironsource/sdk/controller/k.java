package com.ironsource.sdk.controller;

import android.content.Context;
import android.content.Intent;
import com.ironsource.InterfaceC4749g;
import com.ironsource.InterfaceC4767h;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface k {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements InterfaceC4749g {
        @Override // com.ironsource.InterfaceC4749g
        @NotNull
        public Intent a() {
            return new Intent("android.intent.action.VIEW");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b implements InterfaceC4767h {
        @Override // com.ironsource.InterfaceC4767h
        @NotNull
        public Intent a(@NotNull Context context) {
            context.getClass();
            return new Intent(context, (Class<?>) InlineStoreActivity.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class c implements InterfaceC4767h {
        @Override // com.ironsource.InterfaceC4767h
        @NotNull
        public Intent a(@NotNull Context context) {
            context.getClass();
            return new Intent(context, (Class<?>) OpenUrlActivity.class);
        }
    }
}
