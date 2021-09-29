package com.sap.unal.webservice.repositories;

import com.sap.unal.webservice.entities.Detalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DetalleRepository extends JpaRepository<Detalle, Long> {
    @Query(value = "select 'BOG' DET_PREFIJO, Pago.nroRecibo DET_NRORECIBO, '1001' DET_SEDE, '2014' DET_NITEMES, '1' DET_CANTIDA, Pago.valorPagado DET_VLRUNIT, '' DET_PCT_DESC, '' DET_CODIGO, if(Proceso.id=15, Procedimiento.nombre, Proceso.nombre) DET_NOMBRE, '' DET_DESCRIP, '' DET_DOCU_HIJO from Pago left join Cita on Cita.idPago=Pago.id left join InformeResumen on InformeResumen.idPago=Pago.id left join Caso on Caso.id=Cita.idCaso or InformeResumen.idCaso=Caso.id left join TallerInscritos on Pago.id=TallerInscritos.idPago left join Taller on TallerInscritos.idTaller=Taller.id left join Person terapeuta on  Cita.idTerapeuta=terapeuta.id or Taller.idTallerista1=terapeuta.id left join Person consultante on Pago.idPerson=consultante.id left join Procedimiento on Cita.idProcedimiento=Procedimiento.id or Procedimiento.id=InformeResumen.idProcedimiento or Procedimiento.id=Taller.idProcedimiento left join Proceso on Procedimiento.idProceso=Proceso.id where Pago.fechaRegistro = ?1 and Pago.idOrdenPago is null group by Pago.id", nativeQuery = true)
    List<Detalle> findDetalle(String date);
}
