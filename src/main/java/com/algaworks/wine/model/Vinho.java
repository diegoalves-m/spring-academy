package com.algaworks.wine.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Vinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nome;
    @Enumerated(EnumType.STRING)
    private TipoVinho tipo;
    private Integer safra;
    private Integer volume;
    private BigDecimal preco;
    private String foto;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @NotBlank(message = "O nome é obrigatório")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @NotNull(message = "O tipo é obrigatório")
    public TipoVinho getTipo() {
        return tipo;
    }

    public void setTipo(TipoVinho tipo) {
        this.tipo = tipo;
    }

    @NotNull(message = "A safra é obrigatória")
    public Integer getSafra() {
        return safra;
    }

    public void setSafra(Integer safra) {
        this.safra = safra;
    }

    @NotNull(message = "O volume é obrigatório")
    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @NotNull(message = "O valor é obrigatório")
    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Vinho other = (Vinho) obj;
        if (codigo == null) {
            if (other.codigo != null) {
                return false;
            }
        } else if (!codigo.equals(other.codigo)) {
            return false;
        }
        return true;
    }

}
