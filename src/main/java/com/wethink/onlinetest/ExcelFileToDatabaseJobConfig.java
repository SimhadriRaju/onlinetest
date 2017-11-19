package com.wethink.onlinetest;
/*package com.mkyong;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.excel.mapping.BeanWrapperRowMapper;
import org.springframework.batch.item.excel.poi.PoiItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.RowMapper;
 
@Configuration
public class ExcelFileToDatabaseJobConfig {
 
    @Bean
    ItemReader<TestDTO> excelStudentReader() {
        PoiItemReader<TestDTO> reader = new PoiItemReader<>();
        reader.setLinesToSkip(1);
        reader.setResource(new ClassPathResource("data/students.xlsx"));
        reader.setRowMapper(excelRowMapper());
        return reader;
    }
 
    private RowMapper<TestDTO> excelRowMapper() {
        BeanWrapperRowMapper<TestDTO> rowMapper = new BeanWrapperRowMapper<>();
        rowMapper.setTargetType(TestDTO.class);
        return rowMapper;
    }
}*/