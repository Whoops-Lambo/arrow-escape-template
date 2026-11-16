package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.audio.AudioCapabilities;
import com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class pa extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ AudioCapabilitiesReceiver c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(AudioCapabilitiesReceiver audioCapabilitiesReceiver, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = audioCapabilitiesReceiver;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.c;
        audioCapabilitiesReceiver.onNewAudioCapabilities(AudioCapabilities.getCapabilities(audioCapabilitiesReceiver.context));
    }
}
