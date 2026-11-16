package defpackage;

import android.content.ClipData;
import android.media.AudioProfile;
import android.media.MediaDrm;
import android.view.ContentInfo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e6 {
    public static /* bridge */ /* synthetic */ ContentInfo B(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ AudioProfile g(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent i(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    public static /* synthetic */ ContentInfo.Builder j(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }
}
