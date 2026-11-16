package com.bykv.vk.openvk.preload.falconx.loader;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.e.b;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.File;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class a implements ILoader {
    private b a;
    private AtomicBoolean b = new AtomicBoolean(false);

    public final int a(String str) throws Exception {
        if (!this.b.get()) {
            return this.a.b(str);
        }
        y.j("released!");
        return 0;
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public boolean exist(String str) throws Exception {
        if (!this.b.get()) {
            return this.a.c(str);
        }
        y.j("released!");
        return false;
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public Map<String, Long> getChannelVersion() {
        return this.a.b();
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public InputStream getInputStream(String str) throws Exception {
        if (this.b.get()) {
            y.j("released!");
            return null;
        }
        GeckoLogger.d("WebOffline-falcon", "GeckoResLoader ready to load, file:", str);
        return this.a.a(str);
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public String getResRootDir() {
        return this.a.a();
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public void release() throws Exception {
        if (this.b.getAndSet(true)) {
            return;
        }
        this.a.c();
    }

    public a(Context context, String str, File file) {
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (file != null) {
                    this.a = new b(context, str, file);
                    return;
                } else {
                    y.j("resRootDir == null");
                    throw null;
                }
            }
            y.j("access key empty");
            throw null;
        }
        y.j("context == null");
        throw null;
    }
}
