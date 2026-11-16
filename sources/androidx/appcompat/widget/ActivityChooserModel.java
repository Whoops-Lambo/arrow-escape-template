package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.C4664b4;
import com.unity3d.services.UnityAdsConstants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
class ActivityChooserModel extends DataSetObservable {
    public static final Object h = new Object();
    public static final HashMap i = new HashMap();
    public final Object a = new Object();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ActivitySorter d;
    public final int e;
    public boolean f;
    public boolean g;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ActivityChooserModelClient {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ActivityResolveInfo implements Comparable<ActivityResolveInfo> {
        public final int hashCode() {
            return Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + 31;
        }

        public final String toString() {
            throw null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(ActivityResolveInfo activityResolveInfo) {
            activityResolveInfo.getClass();
            return Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) - Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ActivityResolveInfo.class != obj.getClass()) {
                return false;
            }
            return Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ActivitySorter {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class DefaultSorter implements ActivitySorter {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class HistoricalRecord {
        public final ComponentName a;
        public final long b;
        public final float c;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || HistoricalRecord.class != obj.getClass()) {
                return false;
            }
            HistoricalRecord historicalRecord = (HistoricalRecord) obj;
            ComponentName componentName = historicalRecord.a;
            ComponentName componentName2 = this.a;
            if (componentName2 == null) {
                if (componentName != null) {
                    return false;
                }
            } else if (!componentName2.equals(componentName)) {
                return false;
            }
            return this.b == historicalRecord.b && Float.floatToIntBits(this.c) == Float.floatToIntBits(historicalRecord.c);
        }

        public final int hashCode() {
            ComponentName componentName = this.a;
            int iHashCode = componentName == null ? 0 : componentName.hashCode();
            long j = this.b;
            return Float.floatToIntBits(this.c) + ((((iHashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31);
        }

        public final String toString() {
            return "[; activity:" + this.a + "; time:" + this.b + "; weight:" + new BigDecimal(this.c) + C4664b4.j.e;
        }

        public HistoricalRecord(ComponentName componentName, long j, float f) {
            this.a = componentName;
            this.b = j;
            this.c = f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnChooseActivityListener {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class PersistHistoryAsyncTask extends AsyncTask<Object, Void, Void> {
        @Override // android.os.AsyncTask
        public final Void doInBackground(Object[] objArr) {
            throw null;
        }
    }

    public static ActivityChooserModel b() {
        ActivityChooserModel activityChooserModel;
        synchronized (h) {
            try {
                activityChooserModel = (ActivityChooserModel) i.get(null);
                if (activityChooserModel == null) {
                    new ActivityChooserModel();
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return activityChooserModel;
    }

    public final void a() {
        if (this.f && this.g && !TextUtils.isEmpty(null)) {
            this.f = false;
            throw null;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size() - this.e;
        if (size <= 0) {
            return;
        }
        this.g = true;
        for (int i2 = 0; i2 < size; i2++) {
        }
    }

    public final ResolveInfo c() {
        synchronized (this.a) {
            try {
                a();
                if (!this.b.isEmpty()) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }

    public ActivityChooserModel() {
        new HashMap();
        this.e = 50;
        this.f = true;
        this.g = true;
        throw null;
    }
}
