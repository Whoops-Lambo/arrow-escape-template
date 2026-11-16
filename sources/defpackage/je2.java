package defpackage;

import com.facebook.internal.m;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public enum je2 implements m {
    SHARE_DIALOG(20130618),
    PHOTOS(20140204),
    VIDEO(20141028),
    MULTIMEDIA(20160327),
    /* JADX INFO: Fake field, exist only in values array */
    HASHTAG(20160327),
    /* JADX INFO: Fake field, exist only in values array */
    LINK_SHARE_QUOTES(20160327);

    public final int a;

    @Override // com.facebook.internal.m
    public final int d() {
        return this.a;
    }

    @Override // com.facebook.internal.m
    public final String getAction() {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }

    je2(int i) {
        this.a = i;
    }
}
