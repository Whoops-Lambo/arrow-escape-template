package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import com.google.android.gms.internal.ads.w;
import com.google.android.gms.internal.ads.zzfq;
import com.google.android.gms.internal.ads.zzgzb;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s95 {
    public static final w a = zzgzb.x(12);

    public static zzgzb a(AudioDeviceInfo audioDeviceInfo) {
        List audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(xj4.g).reversed());
        Iterator it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile audioProfileG = e6.g(it.next());
            if (audioProfileG.getEncapsulationType() != 1 && zzfq.d(audioProfileG.getFormat())) {
                for (int i : audioProfileG.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i));
                }
            }
        }
        return zzgzb.B(treeSet);
    }
}
