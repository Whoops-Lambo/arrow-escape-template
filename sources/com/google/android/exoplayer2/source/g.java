package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Assertions;
import defpackage.f90;
import defpackage.g90;
import defpackage.ol2;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class g {
    public final ExtractorsFactory a;
    public final HashMap b = new HashMap();
    public final HashSet c = new HashSet();
    public final HashMap d = new HashMap();
    public DataSource.Factory e;
    public DrmSessionManagerProvider f;
    public LoadErrorHandlingPolicy g;

    public g(ExtractorsFactory extractorsFactory) {
        this.a = extractorsFactory;
    }

    public final ol2 a(int i) {
        ol2 f90Var;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.b;
        if (map.containsKey(numValueOf)) {
            return (ol2) map.get(Integer.valueOf(i));
        }
        final DataSource.Factory factory = (DataSource.Factory) Assertions.checkNotNull(this.e);
        final int i2 = 0;
        ol2 ol2Var = null;
        try {
            if (i != 0) {
                final int i3 = 1;
                if (i != 1) {
                    final int i4 = 2;
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                f90Var = new g90(0, this, factory);
                            }
                        } else {
                            f90Var = new f90(Class.forName("com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(MediaSource.Factory.class), 0);
                        }
                    } else {
                        final Class<? extends U> clsAsSubclass = Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                        f90Var = new ol2() { // from class: e90
                            @Override // defpackage.ol2
                            public final Object get() {
                                switch (i4) {
                                    case 0:
                                        break;
                                    case 1:
                                        break;
                                }
                                return DefaultMediaSourceFactory.newInstance(clsAsSubclass, factory);
                            }
                        };
                    }
                } else {
                    final Class<? extends U> clsAsSubclass2 = Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                    f90Var = new ol2() { // from class: e90
                        @Override // defpackage.ol2
                        public final Object get() {
                            switch (i3) {
                                case 0:
                                    break;
                                case 1:
                                    break;
                            }
                            return DefaultMediaSourceFactory.newInstance(clsAsSubclass2, factory);
                        }
                    };
                }
                ol2Var = f90Var;
            } else {
                final Class<? extends U> clsAsSubclass3 = Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                ol2Var = new ol2() { // from class: e90
                    @Override // defpackage.ol2
                    public final Object get() {
                        switch (i2) {
                            case 0:
                                break;
                            case 1:
                                break;
                        }
                        return DefaultMediaSourceFactory.newInstance(clsAsSubclass3, factory);
                    }
                };
            }
        } catch (ClassNotFoundException unused) {
        }
        map.put(Integer.valueOf(i), ol2Var);
        if (ol2Var != null) {
            this.c.add(Integer.valueOf(i));
        }
        return ol2Var;
    }
}
