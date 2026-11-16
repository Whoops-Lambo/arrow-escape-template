package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.a1;
import com.moloco.sdk.publisher.AdFormatType;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class z41 implements a1, wv3 {
    public long a;
    public long b;
    public final Object c;

    public long a() {
        long j = this.a;
        long jH = xe0.h(j, xe0.l(this.b));
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AdCreateLoadTimeoutManager", ((AdFormatType) this.c) + " timeout: " + ((Object) xe0.k(j)) + ", create ad duration: " + ((Object) xe0.k(this.b)) + ". Return value: " + ((Object) xe0.k(jH)), false, 4, null);
        return jH;
    }

    public void b() {
        long height;
        StringBuilder sb = new StringBuilder("cache size=");
        sb.append(this.a);
        sb.append(" length=");
        Map map = (Map) this.c;
        sb.append(map.size());
        Log.i("MemoryCache", sb.toString());
        if (this.a > this.b) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                long j = this.a;
                Bitmap bitmap = ((BitmapDrawable) entry.getValue()).getBitmap();
                if (bitmap == null) {
                    height = 0;
                } else {
                    height = bitmap.getHeight() * bitmap.getRowBytes();
                }
                this.a = j - height;
                it.remove();
                if (this.a <= this.b) {
                    break;
                }
            }
            Log.i("MemoryCache", "Clean cache. New size " + map.size());
        }
    }

    public void c(String str, Drawable drawable) {
        long height;
        Map map = (Map) this.c;
        try {
            long height2 = 0;
            if (map.containsKey(str)) {
                long j = this.a;
                Bitmap bitmap = ((BitmapDrawable) map.get(str)).getBitmap();
                if (bitmap == null) {
                    height = 0;
                } else {
                    height = bitmap.getHeight() * bitmap.getRowBytes();
                }
                this.a = j - height;
            }
            map.put(str, drawable);
            long j2 = this.a;
            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap2 != null) {
                height2 = bitmap2.getHeight() * bitmap2.getRowBytes();
            }
            this.a = j2 + height2;
            b();
            Log.d("MemoryCache", "Drawable used from cache");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // defpackage.wv3
    public void d(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = ((FileChannel) this.c).map(FileChannel.MapMode.READ_ONLY, this.a + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // defpackage.wv3
    public long zza() {
        return this.b;
    }

    public z41() {
        this.c = Collections.synchronizedMap(new LinkedHashMap(10, 1.5f, true));
        this.a = 0L;
        this.b = 1000000L;
        this.b = Runtime.getRuntime().maxMemory() / 4;
        Log.i("MemoryCache", "MemoryCache will use up to " + ((this.b / 1024.0d) / 1024.0d) + "MB");
    }

    public z41(FileChannel fileChannel, long j, long j2) {
        this.c = fileChannel;
        this.a = j;
        this.b = j2;
    }

    public z41(AdFormatType adFormatType, long j) {
        adFormatType.getClass();
        this.c = adFormatType;
        this.a = j;
        uf0 uf0Var = xe0.b;
        this.b = 0L;
    }

    @Override // com.moloco.sdk.internal.publisher.a1
    public void a(long j, long j2) {
        this.b = vk3.x(j2 - j, af0.MILLISECONDS);
    }
}
