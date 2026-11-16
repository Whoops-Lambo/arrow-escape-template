package androidx.privacysandbox.ads.adservices.measurement;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import androidx.privacysandbox.ads.adservices.internal.BackCompatManager;
import defpackage.dy;
import defpackage.oy0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManager;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class MeasurementManager {
    public abstract Object a(DeletionRequest deletionRequest, dy dyVar);

    public abstract Object b(dy dyVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, dy dyVar);

    public abstract Object d(SourceRegistrationRequest sourceRegistrationRequest, dy dyVar);

    public abstract Object e(Uri uri, dy dyVar);

    public abstract Object f(WebSourceRegistrationRequest webSourceRegistrationRequest, dy dyVar);

    public abstract Object g(WebTriggerRegistrationRequest webTriggerRegistrationRequest, dy dyVar);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManager$Companion;", "", "", "MEASUREMENT_API_STATE_DISABLED", "I", "MEASUREMENT_API_STATE_ENABLED", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static MeasurementManager a(Context context) {
            context.getClass();
            Log.d("MeasurementManager", "AdServicesInfo.version=" + AdServicesInfo.a());
            if (AdServicesInfo.a() >= 5) {
                Object systemService = context.getSystemService((Class<Object>) oy0.s());
                systemService.getClass();
                return new MeasurementManagerApi33Ext5Impl(oy0.o(systemService));
            }
            if (AdServicesInfo.b() >= 9) {
                return (MeasurementManager) BackCompatManager.a(context, "MeasurementManager", new MeasurementManager$Companion$obtain$1(context));
            }
            return null;
        }
    }
}
