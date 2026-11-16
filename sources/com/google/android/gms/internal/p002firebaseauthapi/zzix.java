package com.google.android.gms.internal.p002firebaseauthapi;

import io.p071bidmachine.media3.extractor.ts.y;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzix implements zzhj {
    public final Cipher a() {
        try {
            Cipher cipher = (Cipher) zziy.a.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e) {
            y.m("AES GCM SIV cipher is not available or is invalid.", e);
            return null;
        }
    }
}
