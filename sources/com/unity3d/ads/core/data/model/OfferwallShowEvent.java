package com.unity3d.ads.core.data.model;

import defpackage.e80;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "", "<init>", "()V", "Show", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent$Show;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class OfferwallShowEvent {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/unity3d/ads/core/data/model/OfferwallShowEvent$Show;", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Show extends OfferwallShowEvent {

        @NotNull
        public static final Show INSTANCE = new Show();

        private Show() {
            super(null);
        }
    }

    public /* synthetic */ OfferwallShowEvent(e80 e80Var) {
        this();
    }

    private OfferwallShowEvent() {
    }
}
