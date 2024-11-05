package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f95a;

    /* renamed from: b  reason: collision with root package name */
    public int f96b;

    /* renamed from: c  reason: collision with root package name */
    public int f97c;

    /* renamed from: d  reason: collision with root package name */
    public int f98d;

    /* renamed from: e  reason: collision with root package name */
    public int f99e;

    static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f95a = parcel.readInt();
        this.f97c = parcel.readInt();
        this.f98d = parcel.readInt();
        this.f99e = parcel.readInt();
        this.f96b = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f95a);
        parcel.writeInt(this.f97c);
        parcel.writeInt(this.f98d);
        parcel.writeInt(this.f99e);
        parcel.writeInt(this.f96b);
    }
}
