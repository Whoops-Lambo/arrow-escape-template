package com.google.android.gms.internal.ads;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import androidx.media3.common.C;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgsy {
    public static final ClipData a = ClipData.newIntent("", new Intent());

    public static Intent a(int i, Intent intent) {
        boolean zB = b(0, 17);
        boolean zB2 = b(0, 9);
        boolean zB3 = b(0, 5);
        boolean zB4 = b(0, 3);
        zzgvz.b("Must set component on Intent.", intent.getComponent() != null);
        if (b(0, 1)) {
            zzgvz.b("Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.", !b(i, C.BUFFER_FLAG_NOT_DEPENDED_ON));
        } else {
            zzgvz.b("Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.", b(i, C.BUFFER_FLAG_NOT_DEPENDED_ON));
        }
        Intent intent2 = new Intent(intent);
        if (!b(i, C.BUFFER_FLAG_NOT_DEPENDED_ON)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!zB4 && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!zB2 && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!zB3 && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!zB && intent2.getClipData() == null) {
                intent2.setClipData(a);
            }
        }
        return intent2;
    }

    public static boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
