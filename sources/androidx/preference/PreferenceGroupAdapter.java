package androidx.preference;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@RestrictTo
public class PreferenceGroupAdapter extends RecyclerView.Adapter<PreferenceViewHolder> implements Preference.OnPreferenceChangeInternalListener, PreferenceGroup.PreferencePositionCallback {
    public ArrayList j;

    /* JADX INFO: renamed from: androidx.preference.PreferenceGroupAdapter$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.preference.PreferenceGroupAdapter$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    class AnonymousClass2 extends DiffUtil.Callback {
    }

    /* JADX INFO: renamed from: androidx.preference.PreferenceGroupAdapter$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    class AnonymousClass3 implements Preference.OnPreferenceClickListener {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class PreferenceResourceDescriptor {
        public final int a;
        public final int b;
        public final String c;

        public final boolean equals(Object obj) {
            if (!(obj instanceof PreferenceResourceDescriptor)) {
                return false;
            }
            PreferenceResourceDescriptor preferenceResourceDescriptor = (PreferenceResourceDescriptor) obj;
            return this.a == preferenceResourceDescriptor.a && this.b == preferenceResourceDescriptor.b && TextUtils.equals(this.c, preferenceResourceDescriptor.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.a) * 31) + this.b) * 31);
        }

        public PreferenceResourceDescriptor(Preference preference) {
            this.c = preference.getClass().getName();
            this.a = preference.u;
            this.b = preference.v;
        }
    }

    public final void a(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.A);
        }
        if (preferenceGroup.A.size() <= 0) {
            return;
        }
        Preference preferenceM = preferenceGroup.m(0);
        arrayList.add(preferenceM);
        new PreferenceResourceDescriptor(preferenceM);
        throw null;
    }

    public final Preference c(int i) {
        if (i < 0) {
            return null;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        c(i).f((PreferenceViewHolder) viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (!hasStableIds()) {
            return -1L;
        }
        return c(i).a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        new PreferenceResourceDescriptor(c(i));
        throw null;
    }
}
