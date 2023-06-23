package com.codecrafters.hackacode.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name="clientes")
public class Cliente extends Persona {

    @NotBlank
    private Integer edad;

    @NotBlank
    private Long altura;

    @OneToMany(mappedBy = "idEntrada")
    private Entrada entradas[];
}
