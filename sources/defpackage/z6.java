package defpackage;

import com.farimarwat.grizzly.anrmonitor.AnrMonitorException;
import com.farimarwat.grizzly.anrmonitor.AnrMonitorImpl;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnrMonitorImpl b;

    public /* synthetic */ z6(AnrMonitorImpl anrMonitorImpl, int i) {
        this.a = i;
        this.b = anrMonitorImpl;
    }

    @Override // java.lang.Runnable
    public final void run() throws AnrMonitorException {
        int i = this.a;
        AnrMonitorImpl anrMonitorImpl = this.b;
        switch (i) {
            case 0:
                AnrMonitorImpl.startMonitor$lambda$1(anrMonitorImpl);
                break;
            default:
                AnrMonitorImpl.startMonitor$lambda$1$lambda$0(anrMonitorImpl);
                break;
        }
    }
}
