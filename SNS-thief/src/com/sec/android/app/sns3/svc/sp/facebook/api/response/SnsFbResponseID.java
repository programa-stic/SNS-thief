/*******************************************************************************
 * Copyright (c) 2014, Fundación Dr. Manuel Sadosky. Todos los derechos reservados.
 * 
 * La redistribución y el uso en las formas de código fuente y binario, con o sin
 * modificaciones, están permitidos siempre que se cumplan las siguientes condiciones:
 * 
 * 1. Las redistribuciones del código fuente deben conservar el aviso de copyright
 * anterior, esta lista de condiciones y el siguiente descargo de responsabilidad.
 * 
 * 2. Las redistribuciones en formato binario deben reproducir el aviso de copyright
 * anterior, esta lista de condiciones y la siguiente renuncia en la documentación
 * y/u otros materiales suministrados con la distribución.
 * 
 * ESTE SOFTWARE SE SUMINISTRA POR LA Fundación Dr. Manuel Sadosky ''COMO ESTÁ'' Y CUALQUIER
 * GARANTÍA EXPRESA O IMPLÍCITAS, INCLUYENDO, PERO NO LIMITADO A, LAS GARANTÍAS
 * IMPLÍCITAS DE COMERCIALIZACIÓN Y APTITUD PARA UN PROPÓSITO DETERMINADO SON
 * RECHAZADAS. EN NINGÚN CASO Fundación Dr. Manuel Sadosky SERÁ RESPONSABLE POR NINGÚN
 * DAÑO DIRECTO, INDIRECTO, INCIDENTAL, ESPECIAL, EJEMPLAR O CONSECUENTE (INCLUYENDO,
 * PERO NO LIMITADO A, LA ADQUISICIÓN DE BIENES O SERVICIOS; LA PÉRDIDA DE USO, DE
 * DATOS O DE BENEFICIOS; O INTERRUPCIÓN DE LA ACTIVIDAD EMPRESARIAL) O POR
 * CUALQUIER TEORÍA DE RESPONSABILIDAD, YA SEA POR CONTRATO, RESPONSABILIDAD ESTRICTA
 * O AGRAVIO (INCLUYENDO NEGLIGENCIA O CUALQUIER OTRA CAUSA) QUE SURJA DE CUALQUIER
 * MANERA DEL USO DE ESTE SOFTWARE, INCLUSO SI SE HA ADVERTIDO DE LA POSIBILIDAD DE
 * TALES DAÑOS.
 * 
 * Las opiniones y conclusiones contenidas en el software y la documentación son las
 * de los autores y no deben interpretarse como la representación de las políticas
 * oficiales, ya sea expresa o implícita, de Fundación Dr. Manuel Sadosky .
 * 
 * Prueba de concepto de vulnerabilidad de SNS
 * Author: Joaquín Rinaudo
 ******************************************************************************/
package com.sec.android.app.sns3.svc.sp.facebook.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.sec.android.app.sns3.svc.sp.SnsSpResponse;


public final class SnsFbResponseID extends SnsSpResponse implements Parcelable {
    public static final Creator<SnsFbResponseID> CREATOR;
    public String mID;

    static {
        CREATOR = new Creator<SnsFbResponseID>() {
            public SnsFbResponseID createFromParcel(Parcel in) {
                return new SnsFbResponseID(null);
            }

            public SnsFbResponseID[] newArray(int size) {
                return new SnsFbResponseID[size];
            }
        };
    }

    private SnsFbResponseID(Parcel in) {
        readFromParcel(in);
    }

    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel in) {
        this.mID = in.readString();
    }

    public void writeToParcel(Parcel out, int flag) {
        out.writeString(this.mID);
    }
}
