package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class AlertDialog extends AppCompatDialog implements DialogInterface {
    public final AlertController f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Builder {
        public final AlertController.AlertParams a;
        public final int b;

        @NonNull
        public AlertDialog create() {
            ListAdapter checkedItemAdapter;
            final AlertController.AlertParams alertParams = this.a;
            ContextThemeWrapper contextThemeWrapper = alertParams.a;
            ContextThemeWrapper contextThemeWrapper2 = alertParams.a;
            AlertDialog alertDialog = new AlertDialog(contextThemeWrapper, this.b);
            View view = alertParams.e;
            final AlertController alertController = alertDialog.f;
            if (view != null) {
                alertController.w = view;
            } else {
                CharSequence charSequence = alertParams.d;
                if (charSequence != null) {
                    alertController.d = charSequence;
                    TextView textView = alertController.u;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = alertParams.c;
                if (drawable != null) {
                    alertController.s = drawable;
                    ImageView imageView = alertController.t;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.t.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = alertParams.f;
            if (charSequence2 != null) {
                alertController.e = charSequence2;
                TextView textView2 = alertController.v;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = alertParams.g;
            if (charSequence3 != null) {
                alertController.c(-1, charSequence3, alertParams.h);
            }
            CharSequence charSequence4 = alertParams.i;
            if (charSequence4 != null) {
                alertController.c(-2, charSequence4, alertParams.j);
            }
            if (alertParams.n != null || alertParams.o != null) {
                final AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) alertParams.b.inflate(alertController.A, (ViewGroup) null);
                if (alertParams.s) {
                    checkedItemAdapter = new ArrayAdapter<CharSequence>(contextThemeWrapper2, alertController.B, alertParams.n) { // from class: androidx.appcompat.app.AlertController.AlertParams.1
                        @Override // android.widget.ArrayAdapter, android.widget.Adapter
                        public final View getView(int i, View view2, ViewGroup viewGroup) {
                            View view3 = super.getView(i, view2, viewGroup);
                            boolean[] zArr = AlertParams.this.r;
                            if (zArr != null && zArr[i]) {
                                recycleListView.setItemChecked(i, true);
                            }
                            return view3;
                        }
                    };
                } else {
                    int i = alertParams.t ? alertController.C : alertController.D;
                    checkedItemAdapter = alertParams.o;
                    if (checkedItemAdapter == null) {
                        checkedItemAdapter = new AlertController.CheckedItemAdapter(contextThemeWrapper2, i, R.id.text1, alertParams.n);
                    }
                }
                alertController.x = checkedItemAdapter;
                alertController.y = alertParams.u;
                if (alertParams.p != null) {
                    recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.app.AlertController.AlertParams.3
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView adapterView, View view2, int i2, long j) {
                            AlertParams alertParams2 = AlertParams.this;
                            DialogInterface.OnClickListener onClickListener = alertParams2.p;
                            AlertController alertController2 = alertController;
                            onClickListener.onClick(alertController2.b, i2);
                            if (alertParams2.t) {
                                return;
                            }
                            alertController2.b.dismiss();
                        }
                    });
                } else if (alertParams.v != null) {
                    recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.app.AlertController.AlertParams.4
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView adapterView, View view2, int i2, long j) {
                            AlertParams alertParams2 = AlertParams.this;
                            boolean[] zArr = alertParams2.r;
                            RecycleListView recycleListView2 = recycleListView;
                            if (zArr != null) {
                                zArr[i2] = recycleListView2.isItemChecked(i2);
                            }
                            alertParams2.v.onClick(alertController.b, i2, recycleListView2.isItemChecked(i2));
                        }
                    });
                }
                if (alertParams.t) {
                    recycleListView.setChoiceMode(1);
                } else if (alertParams.s) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.f = recycleListView;
            }
            View view2 = alertParams.q;
            if (view2 != null) {
                alertController.g = view2;
                alertController.h = false;
            }
            alertDialog.setCancelable(alertParams.k);
            if (alertParams.k) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(null);
            alertDialog.setOnDismissListener(alertParams.l);
            DialogInterface.OnKeyListener onKeyListener = alertParams.m;
            if (onKeyListener != null) {
                alertDialog.setOnKeyListener(onKeyListener);
            }
            return alertDialog;
        }

        @NonNull
        public Context getContext() {
            return this.a.a;
        }

        public Builder setNegativeButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.a;
            alertParams.i = alertParams.a.getText(i);
            alertParams.j = onClickListener;
            return this;
        }

        public Builder setPositiveButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.a;
            alertParams.g = alertParams.a.getText(i);
            alertParams.h = onClickListener;
            return this;
        }

        public Builder setTitle(@Nullable CharSequence charSequence) {
            this.a.d = charSequence;
            return this;
        }

        public Builder setView(View view) {
            this.a.q = view;
            return this;
        }

        public Builder(@NonNull Context context, @StyleRes int i) {
            this.a = new AlertController.AlertParams(new ContextThemeWrapper(context, AlertDialog.g(context, i)));
            this.b = i;
        }

        public Builder(Context context) {
            this(context, AlertDialog.g(context, 0));
        }
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.ecffri.arrows.R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final AlertController.RecycleListView f() {
        return this.f.f;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.r;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.r;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public AlertDialog(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, g(contextThemeWrapper, i));
        this.f = new AlertController(getContext(), this, getWindow());
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.p003activity.ComponentDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        ListAdapter listAdapter;
        int paddingTop;
        int paddingBottom;
        View viewFindViewById;
        View viewFindViewById2;
        super.onCreate(bundle);
        AlertController alertController = this.f;
        alertController.b.setContentView(alertController.z);
        Context context = alertController.a;
        Window window = alertController.c;
        View viewFindViewById3 = window.findViewById(com.ecffri.arrows.R.id.parentPanel);
        View viewFindViewById4 = viewFindViewById3.findViewById(com.ecffri.arrows.R.id.topPanel);
        View viewFindViewById5 = viewFindViewById3.findViewById(com.ecffri.arrows.R.id.contentPanel);
        View viewFindViewById6 = viewFindViewById3.findViewById(com.ecffri.arrows.R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(com.ecffri.arrows.R.id.customPanel);
        View view = alertController.g;
        if (view == null) {
            view = null;
        }
        int i3 = 0;
        if (view != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !AlertController.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(com.ecffri.arrows.R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (alertController.f != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById7 = viewGroup.findViewById(com.ecffri.arrows.R.id.topPanel);
        View viewFindViewById8 = viewGroup.findViewById(com.ecffri.arrows.R.id.contentPanel);
        View viewFindViewById9 = viewGroup.findViewById(com.ecffri.arrows.R.id.buttonPanel);
        ViewGroup viewGroupB = AlertController.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB2 = AlertController.b(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupB3 = AlertController.b(viewFindViewById9, viewFindViewById6);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(com.ecffri.arrows.R.id.scrollView);
        alertController.r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(R.id.message);
        alertController.v = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.r.removeView(alertController.v);
                if (alertController.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(alertController.r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(alertController.f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(R.id.button1);
        alertController.i = button;
        View.OnClickListener onClickListener = alertController.G;
        button.setOnClickListener(onClickListener);
        boolean zIsEmpty = TextUtils.isEmpty(alertController.j);
        Button button2 = alertController.i;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(alertController.j);
            alertController.i.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupB3.findViewById(R.id.button2);
        alertController.l = button3;
        button3.setOnClickListener(onClickListener);
        boolean zIsEmpty2 = TextUtils.isEmpty(alertController.m);
        Button button4 = alertController.l;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(alertController.m);
            alertController.l.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupB3.findViewById(R.id.button3);
        alertController.o = button5;
        button5.setOnClickListener(onClickListener);
        boolean zIsEmpty3 = TextUtils.isEmpty(alertController.p);
        Button button6 = alertController.o;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(alertController.p);
            alertController.o.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.ecffri.arrows.R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = alertController.i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = alertController.l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = alertController.o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (alertController.w != null) {
            viewGroupB.addView(alertController.w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(com.ecffri.arrows.R.id.title_template).setVisibility(8);
        } else {
            alertController.t = (ImageView) window.findViewById(R.id.icon);
            if (!TextUtils.isEmpty(alertController.d) && alertController.E) {
                TextView textView2 = (TextView) window.findViewById(com.ecffri.arrows.R.id.alertTitle);
                alertController.u = textView2;
                textView2.setText(alertController.d);
                Drawable drawable = alertController.s;
                if (drawable != null) {
                    alertController.t.setImageDrawable(drawable);
                } else {
                    alertController.u.setPadding(alertController.t.getPaddingLeft(), alertController.t.getPaddingTop(), alertController.t.getPaddingRight(), alertController.t.getPaddingBottom());
                    alertController.t.setVisibility(8);
                }
            } else {
                window.findViewById(com.ecffri.arrows.R.id.title_template).setVisibility(8);
                alertController.t.setVisibility(8);
                viewGroupB.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (viewGroupB != null && viewGroupB.getVisibility() != 8) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (viewGroupB3.getVisibility() != 8) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && (viewFindViewById2 = viewGroupB2.findViewById(com.ecffri.arrows.R.id.textSpacerNoButtons)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = alertController.r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (alertController.e == null && alertController.f == null) {
                viewFindViewById = null;
            } else {
                viewFindViewById = viewGroupB.findViewById(com.ecffri.arrows.R.id.titleDividerNoCustom);
            }
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(com.ecffri.arrows.R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f;
        if (recycleListView != null && (!z3 || i2 == 0)) {
            int paddingLeft = recycleListView.getPaddingLeft();
            if (i2 != 0) {
                paddingTop = recycleListView.getPaddingTop();
            } else {
                paddingTop = recycleListView.a;
            }
            int paddingRight = recycleListView.getPaddingRight();
            if (z3) {
                paddingBottom = recycleListView.getPaddingBottom();
            } else {
                paddingBottom = recycleListView.b;
            }
            recycleListView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
        if (!z2) {
            ViewGroup viewGroup3 = alertController.f;
            if (viewGroup3 == null) {
                viewGroup3 = alertController.r;
            }
            if (viewGroup3 != null) {
                if (z3) {
                    i3 = 2;
                }
                View viewFindViewById11 = window.findViewById(com.ecffri.arrows.R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(com.ecffri.arrows.R.id.scrollIndicatorDown);
                ViewCompat.J(viewGroup3, i2 | i3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.f;
        if (recycleListView2 != null && (listAdapter = alertController.x) != null) {
            recycleListView2.setAdapter(listAdapter);
            int i4 = alertController.y;
            if (i4 > -1) {
                recycleListView2.setItemChecked(i4, true);
                recycleListView2.setSelection(i4);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f;
        alertController.d = charSequence;
        TextView textView = alertController.u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
