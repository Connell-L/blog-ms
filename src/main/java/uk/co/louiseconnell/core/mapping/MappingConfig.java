package uk.co.louiseconnell.core.mapping;

import org.mapstruct.Builder;
import org.mapstruct.MapperConfig;

/**
 * Centralised shared mapping configuration for all {@link org.mapstruct.Mapper} interfaces.
 */

@MapperConfig(componentModel = "cdi", builder = @Builder(disableBuilder = true))
public interface MappingConfig {
}
