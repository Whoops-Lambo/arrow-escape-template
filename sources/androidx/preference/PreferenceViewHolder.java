package androidx.preference;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class PreferenceViewHolder extends RecyclerView.ViewHolder {
    public final SparseArray e;
    public boolean f;
    public boolean g;

    public final View a(int i) {
        SparseArray sparseArray = this.e;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.itemView.findViewById(i);
        if (viewFindViewById != null) {
            sparseArray.put(i, viewFindViewById);
        }
        return viewFindViewById;
    }

    public PreferenceViewHolder(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.e = sparseArray;
        sparseArray.put(android.R.id.title, view.findViewById(android.R.id.title));
        sparseArray.put(android.R.id.summary, view.findViewById(android.R.id.summary));
        sparseArray.put(android.R.id.icon, view.findViewById(android.R.id.icon));
        sparseArray.put(com.ecffri.arrows.R.id.icon_frame, view.findViewById(com.ecffri.arrows.R.id.icon_frame));
        sparseArray.put(android.R.id.icon_frame, view.findViewById(android.R.id.icon_frame));
    }
}
