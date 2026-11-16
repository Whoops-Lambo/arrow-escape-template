package com.inmobi.ads;

import defpackage.e80;
import defpackage.ek2;
import defpackage.jh0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/inmobi/ads/AudioStatus;", "", "<init>", "(Ljava/lang/String;I)V", "PLAYING", "PAUSED", "COMPLETED", "Companion", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum AudioStatus {
    PLAYING,
    PAUSED,
    COMPLETED;

    private static final /* synthetic */ jh0 $ENTRIES = ek2.m(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/inmobi/ads/AudioStatus$Companion;", "", "Lcom/inmobi/ads/AudioStatus;", "", "<init>", "()V", "value", "from", "(I)Lcom/inmobi/ads/AudioStatus;", "item", "to", "(Lcom/inmobi/ads/AudioStatus;)Ljava/lang/Integer;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public AudioStatus from(int value) {
            if (value != 0) {
                return value != 1 ? AudioStatus.COMPLETED : AudioStatus.PAUSED;
            }
            return AudioStatus.PLAYING;
        }

        public /* synthetic */ Companion(e80 e80Var) {
            this();
        }

        @NotNull
        public Integer to(@NotNull AudioStatus item) {
            item.getClass();
            return Integer.valueOf(item.ordinal());
        }

        private Companion() {
        }

        public /* bridge */ /* synthetic */ Object from(Object obj) {
            return from(((Number) obj).intValue());
        }
    }

    @NotNull
    public static AudioStatus from(int i) {
        return INSTANCE.from(i);
    }

    @NotNull
    public static jh0 getEntries() {
        return $ENTRIES;
    }

    public static int to(@NotNull AudioStatus audioStatus) {
        return INSTANCE.to(audioStatus).intValue();
    }
}
