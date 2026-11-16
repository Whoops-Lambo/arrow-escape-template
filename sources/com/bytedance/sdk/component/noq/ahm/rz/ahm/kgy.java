package com.bytedance.sdk.component.noq.ahm.rz.ahm;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.sdk.component.noq.ahm.rz.noq;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.component.utils.yo;
import com.bytedance.sdk.openadsdk.fpz.rz;
import com.safedk.android.internal.partials.PangleFilesBridge;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class kgy {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.noq.ahm.rz.ahm.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface InterfaceC0216kgy {
        void kgy();

        void kgy(Drawable drawable);

        void kgy(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ahm(byte[] bArr, noq noqVar, InterfaceC0216kgy interfaceC0216kgy) {
        FileOutputStream fileOutputStream = null;
        try {
            File fileKgy = yo.kgy(noqVar.kgy(), "P_GIF_CACHE", "P_U_GIF_FILE");
            FileOutputStream fileOutputStreamFileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(fileKgy);
            try {
                fileOutputStreamFileOutputStreamCtor.write(bArr, 0, bArr.length);
                if (Build.VERSION.SDK_INT >= 28) {
                    Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileKgy));
                    if (interfaceC0216kgy != null) {
                        interfaceC0216kgy.kgy(drawableDecodeDrawable);
                    }
                } else if (interfaceC0216kgy != null) {
                    interfaceC0216kgy.kgy(bArr);
                }
                try {
                    fileOutputStreamFileOutputStreamCtor.close();
                } catch (Throwable th) {
                    rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6ApkACzbcI=", "a88KtA21ZMaUT/NYihC1JE/KKJYMuGzV", "V+EskSKyYMqBXt5SgjWyKUzvL5kGnnDhiUbS", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                try {
                    rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6ApkACzbcI=", "a88KtA21ZMaUT/NYihC1JE/KKJYMuGzV", "V+EskSKyYMqBXt5SgjWyKUzvL5kGnnDhiUbS", 108);
                    sx.kgy("PAGGifDefaultDecoder", "Gif  getSourceByFile fail : ", th);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            rz.kgy(th3, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6ApkACzbcI=", "a88KtA21ZMaUT/NYihC1JE/KKJYMuGzV", "V+EskSKyYMqBXt5SgjWyKUzvL5kGnnDhiUbS", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
                        }
                    }
                    if (interfaceC0216kgy != null) {
                        interfaceC0216kgy.kgy();
                    }
                } catch (Throwable th4) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th5) {
                            rz.kgy(th5, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6ApkACzbcI=", "a88KtA21ZMaUT/NYihC1JE/KKJYMuGzV", "V+EskSKyYMqBXt5SgjWyKUzvL5kGnnDhiUbS", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
                        }
                    }
                    throw th4;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public void kgy(byte[] bArr, InterfaceC0216kgy interfaceC0216kgy) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap));
                if (interfaceC0216kgy != null) {
                    interfaceC0216kgy.kgy(drawableDecodeDrawable);
                    return;
                }
                return;
            } catch (Throwable th) {
                rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6ApkACzbcI=", "a88KtA21ZMaUT/NYihC1JE/KKJYMuGzV", "V+EskSKyYMqBXt5SgjWyKUzvL5kG", 47);
                sx.rz("PAGGifDefaultDecoder", th.getMessage());
                if (interfaceC0216kgy != null) {
                    interfaceC0216kgy.kgy();
                    return;
                }
                return;
            }
        }
        if (interfaceC0216kgy != null) {
            interfaceC0216kgy.kgy(bArr);
        }
    }

    public void kgy(byte[] bArr, noq noqVar, InterfaceC0216kgy interfaceC0216kgy) {
        if (Build.VERSION.SDK_INT <= 30) {
            kgy(bArr, interfaceC0216kgy, noqVar);
        } else {
            kgy(bArr, interfaceC0216kgy);
        }
    }

    private void kgy(final byte[] bArr, final InterfaceC0216kgy interfaceC0216kgy, final noq noqVar) {
        try {
            noqVar.fi().submit(new Runnable() { // from class: com.bytedance.sdk.component.noq.ahm.rz.ahm.kgy.1
                @Override // java.lang.Runnable
                public void run() {
                    kgy.this.ahm(bArr, noqVar, interfaceC0216kgy);
                }
            });
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6ApkACzbcI=", "a88KtA21ZMaUT/NYihC1JE/KKJYMuGzV", "V+EskSKyYMqBXt5SgjWyKUzvL5kGmmbVoXr+Dtw=", 70);
            sx.rz("PAGGifDefaultDecoder", th.getMessage());
            if (interfaceC0216kgy != null) {
                interfaceC0216kgy.kgy();
            }
        }
    }
}
