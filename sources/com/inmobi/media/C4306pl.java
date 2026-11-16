package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.partials.InMobiFilesBridge;
import defpackage.h50;
import java.io.File;
import java.util.UUID;

/* JADX INFO: renamed from: com.inmobi.media.pl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4306pl implements O0 {
    public final byte[] a;
    public final String b;

    public C4306pl(String str, byte[] bArr) {
        bArr.getClass();
        str.getClass();
        this.a = bArr;
        this.b = str;
    }

    public final String a(Bitmap bitmap) {
        String string = UUID.randomUUID().toString();
        string.getClass();
        String strConcat = string.concat(BrandSafetyUtils.a);
        File file = new File(this.b);
        if (!file.exists()) {
            file.mkdirs();
        }
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, InMobiFilesBridge.fileOutputStreamCtor(new File(h50.i(this.b, "/", strConcat))));
        return h50.i(this.b, "/", strConcat);
    }

    @Override // com.inmobi.media.O0
    public final Object a() {
        byte[] bArr = this.a;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        bitmapDecodeByteArray.getClass();
        return a(bitmapDecodeByteArray);
    }
}
