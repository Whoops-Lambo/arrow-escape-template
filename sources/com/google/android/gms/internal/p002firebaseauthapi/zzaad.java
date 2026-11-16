package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.MessageDigest;
import java.security.Provider;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaad implements zzzx<MessageDigest> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzx
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
