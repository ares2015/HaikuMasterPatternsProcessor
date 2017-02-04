package com.haikuMasterPatternsProcessor.database;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Oliver on 2/3/2017.
 */
public class TrainingDataDatabaseAccessorImpl implements TrainingDataDatabaseAccessor {

    private JdbcTemplate jdbcTemplate;

    public TrainingDataDatabaseAccessorImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insertPattern(String pattern) {
        String sql = "insert into jos_haiku_master_patterns (pattern) values(?)";
        jdbcTemplate.update(sql, new Object[]{pattern});
    }


}
