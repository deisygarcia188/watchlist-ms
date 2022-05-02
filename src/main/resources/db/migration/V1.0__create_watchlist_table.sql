create table public.tb_watchlist (
    id_watchlist serial primary key,
    id_user serial NOT NULL,
    name_watchlist varchar(255) NOT NULL,
    created_at timestamp
)